package Client;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The `Client` class represents a client with a name, age, score, cards, and vote state.
 * It also includes static fields for the server host, server port, and number of connections.
 */
public class Client {
    private String name;
    private Integer age;
    private int score;

    private int roundCardScore = 0;

    public int getRoundCardScore() {
        return roundCardScore;
    }

    public void setRoundCardScore(int roundCardScore) {
        this.roundCardScore = roundCardScore;
    }

    public List<String> cards;

    public List<String> getCards() {
        return cards;
    }

    private int maxHandSize = 7;
    private boolean voteState;

    public String playerVote = "";

    private String playedCard;

    public String getPlayedCard() {
        return playedCard;
    }

    public void setPlayedCard(String playedCard) {
        this.playedCard = playedCard;
    }

    private ClientConnectionHandler correspondingClientConnectionHandlers;

    static final String SERVER_HOST = "10.10.226.165";
    static final int SERVER_PORT = 8500;


    public Client() {
        this.name = null;
        this.age = 0;
        this.score = 0;
        this.cards = new CopyOnWriteArrayList<>();
        this.voteState = false;
    }

    /**
     * Starts the socket connection and initializes the input and output streams.
     *
     * @param socket the socket connection to start
     * @throws IOException if an I/O error occurs when creating the input and output streams
     */
    public void start(Socket socket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
        new Thread(() -> {
            String messageFromServer = null;
            try {
                while ((messageFromServer = in.readLine()) != null) {
                    System.out.println(messageFromServer);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
        String messageToServer = null;
        while ((messageToServer = consoleIn.readLine()) != null) {
            out.println(messageToServer);
        }
    }

    /**
     * Chooses a white card from the deck and adds it to the player's hand.
     */
    private void chooseWhiteCard() {
        int randomCardPosition = new Random().nextInt(correspondingClientConnectionHandlers.getPlayingGame().getWhiteDeck().size());
        cards.add(correspondingClientConnectionHandlers.getPlayingGame().getWhiteDeck().remove(randomCardPosition));
    }

    /**
     * Fills the player's hand with white cards.
     */
    public void fillHand() {
        for (int i = 1; i <= maxHandSize; i++) {
            chooseWhiteCard();
        }
    }

    /**
     * Removes a card from the player's hand and returns it.
     *
     * @param cardPosition the position of the card to remove
     * @return the removed card
     */
    public synchronized String pickCard(int cardPosition) {
        return cards.remove(cardPosition);
    }



    /**
     * Retrieves the score.
     *
     * @return the score value
     */
    public int getScore() {
        return score;
    }


    /**
     * Sets the score.
     *
     * @param score the new score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Retrieves the current vote state.
     *
     * @return true if the vote state is active, false otherwise
     */
    public boolean isVoteState() {
        return voteState;
    }

    /**
     * Sets the vote state of the object.
     *
     * @param voteState the new vote state to be set
     */
    public void setVoteState(boolean voteState) {
        this.voteState = voteState;
    }


    /**
     * Sets the corresponding client connection handler.
     *
     * @param clientConnectionHandler the new corresponding client connection handler
     */
    public void setCorrespondingClientConnectionHandler(ClientConnectionHandler clientConnectionHandler) {
        this.correspondingClientConnectionHandlers = clientConnectionHandler;
    }


    /**
     * Increments the score.
     */
    public void incrementScore() {
        this.score = this.score + 1;
    }


    /**
     * Retrieves the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
}