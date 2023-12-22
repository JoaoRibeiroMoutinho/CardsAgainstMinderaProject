package Messages;


/**
 * The `Messages` class provides static constants representing various messages used in the program.
 * It includes messages for formatting, game instructions, and communication between the server and clients.
 */
public abstract class Messages {
    public static final String RED_BOLD = "\033[1;31m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String YELLOW_BOLD = "\033[1;33m";

    public static final String BLACK_BACKGROUND = "\u001B[40m";

    public static final String WHITE = "\u001B[37m";

    public static final String WHITE_BOLD = "\u001B[37m\u001B[1m";

    public static final String WHITE_BACKGROUND = "\u001B[47m";

    public static final String BLACK = "\u001B[30m";

    public static final String BLACK_BOLD = "\u001B[30m\u001B[1m";

    public static final String RESET_COLOR = "\033[0m";



    public final static String WELCOME =
            "        ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗ \n" +
            "        ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝ \n" +
            "        ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗   \n" +
            "        ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝   \n" +
            "        ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗ \n" +
            "         ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝ \n" +
            "                            ████████╗ ██████╗                          \n" +
            "                            ╚══██╔══╝██╔═══██╗                         \n" +
            "                               ██║   ██║   ██║                         \n" +
            "                               ██║   ██║   ██║                         \n" +
            "                               ██║   ╚██████╔╝                         \n" +
            "                               ╚═╝    ╚═════╝                          \n" +
            "                     ██████╗ █████╗ ██████╗ ██████╗ ███████╗           \n" +
            "                    ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝           \n" +
            "                    ██║     ███████║██████╔╝██║  ██║███████╗           \n" +
            "                    ██║     ██╔══██║██╔══██╗██║  ██║╚════██║           \n" +
            "                    ╚██████╗██║  ██║██║  ██║██████╔╝███████║           \n" +
            "                     ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝           \n" +
            "             █████╗  ██████╗  █████╗ ██╗███╗   ██╗███████╗████████╗    \n" +
            "            ██╔══██╗██╔════╝ ██╔══██╗██║████╗  ██║██╔════╝╚══██╔══╝    \n" +
            "            ███████║██║  ███╗███████║██║██╔██╗ ██║███████╗   ██║       \n" +
            "            ██╔══██║██║   ██║██╔══██║██║██║╚██╗██║╚════██║   ██║       \n" +
            "            ██║  ██║╚██████╔╝██║  ██║██║██║ ╚████║███████║   ██║       \n" +
            "            ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝╚══════╝   ╚═╝       \n" +
            "    ██╗  ██╗██╗   ██╗███╗   ███╗ █████╗ ███╗   ██╗██╗████████╗██╗   ██╗\n" +
            "    ██║  ██║██║   ██║████╗ ████║██╔══██╗████╗  ██║██║╚══██╔══╝╚██╗ ██╔╝\n" +
            "    ███████║██║   ██║██╔████╔██║███████║██╔██╗ ██║██║   ██║    ╚████╔╝ \n" +
            "    ██╔══██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║██║   ██║     ╚██╔╝  \n" +
            "    ██║  ██║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║██║   ██║      ██║   \n" +
            "    ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝   ╚═╝      ╚═╝   \n" +
            "                                                                       \n\n" ;
    public final static String SERVER_ON = "Server is on, waiting connections";
    public final static String WINNER = " wins the game!";
    public final static String CHOOSE_GAME_NAME = "Please input a game name:";
    public final static String GAME_BUILT = "New game built with ";
    public final static String GAME_STARTING = "The game will start in ";
    public final static String NOT_YOUR_GAME = "This game is not yours to start.";
    public final static String ROUND = "Round Nº ";
    public final static String PLAYERS_CALLED = " players, called ";
    public final static String PLAYER_HAS_PLAY = " has played their card!";
    public final static String EXITING_LOBBY = "\n Lobby has been close.\n";
    public final static String SELECT_A_VALID_CARD = "Please select a valid option from your hand";


    public final static String COMMANDS_LIST =
            "AVAILABLE COMMANDS\n\n" + BLUE_BOLD + "/build - > Build a new game \n" + "/available_games - > Check available games \n" + "/join - > join available games \n" + "/start - > Start the game when all players have joined \n" + "/list_players -> List the names of online players \n" + "/change_name " +
                    "-> Change username \n" + "/whisper -> send private message to other player \n" + RESET_COLOR;

    public final static String WHISPER_INSTRUCTIONS = "Invalid whisper use. Correct use: '/whisper <username> <message>";
    public final static String JOIN_INSTRUCTIONS = "Invalid join use. Correct use: '/join <GameName>'";
    public final static String START_INSTRUCTIONS = "Invalid start use. Correct use: '/start <GameName>'";
    public final static String JOINED_GAME = "Successfully joined game - ";
    public final static String GAME_READY = "Your game is ready to start!";
    public final static String INPUT_NAME = RESET_COLOR + "Please input your username: ";
    public final static String NULL_NAME = "Write a valid username";
    public final static String REPEATED_NAME = "Username already taken, please choose another";
    public final static String NO_SUCH_CLIENT = "The client you want to whisper to doesn't exists.";
    public final static String WHISPER = "(whisper)";
    public final static String NO_SUCH_COMMAND = "⚠️ Invalid command!";
    public final static String ACCEPT_NEW_NAME = "Your new name is: ";
    public final static String INPUT_AGE = "What is your age: ";
    public final static String NULL_AGE = "Please insert a valid number";
    public final static String NOT_A_NUMBER = "That isn't a valid number";
    public final static String CLIENT_DISCONNECTED = " has disconnected";
    public final static String LOBBY = "\n --> You are in chat lobby now <-- \n";
    public final static String CLIENT_CONNECTED = "Client connected";
    public final static String PLAYER_HAS_HAND = " has picked their hand!";
    public final static String WAITING_MESSAGE = "Waiting for ";
    public final static String CHOOSE_N_PLAYERS = "Please choose number of players";
    public final static String GAME_WINNER = "The game winner is: ";
    public final static String ROUND_WINNER = " won this round with the card: ";
    public final static String SERVER_MESSAGE_SENT = "Message sent to client";
    public final static String SHOW_GAME_COMMANDS = BLUE_BOLD + "/fill_hand - Get cards from White Deck\n" +
        "/play_card " +
        "<number " +
            "of card>\n" +
            "/vote <number of card>\n" + RESET_COLOR;

    public final static String VOTING_PHASE_START = "VOTING PHASE START";
    public final static String INVALID_VOTE = "INVALID VOTE";

    public final static String VOTING_INSTRUCTIONS = "VOTING INSTRUCTIONS: use /vote and the number of the card";


    // GAME MESSAGES

    public final static String GAME_BEGINS = "Welcome to Cards Against Mindera \n" + "Here are the game rules: \n"
            + "Each player needs to run /fill_hand to pick 7 game cards. \n"
            + "After that, and at every new turn, the game will send out a Black Card. \n"
            + "A Black Card is a prompt, which you will answer using one of the White Cards in your hand. \n"
            + "Once everyone chooses their answer, you will be required to vote in your favourite (other than your own) \n"
            + "The player whose card gets the more votes, wins a point. \n"
            + "The game ends at 7 points, at which time a winner will be declared.\n"
            + "At any time use /show_game_commands to show available commands.";


    public final static String GAME_OVER =
            " ██████╗  █████╗ ███╗   ███╗███████╗     \n" +
            "██╔════╝ ██╔══██╗████╗ ████║██╔════╝     \n" +
            "██║  ███╗███████║██╔████╔██║█████╗       \n" +
            "██║   ██║██╔══██║██║╚██╔╝██║██╔══╝       \n" +
            "╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗     \n" +
            " ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     \n" +
            "                                         \n" +
            " ██████╗ ██╗   ██╗███████╗██████╗     ██╗\n" +
            "██╔═══██╗██║   ██║██╔════╝██╔══██╗    ██║\n" +
            "██║   ██║██║   ██║█████╗  ██████╔╝    ██║\n" +
            "██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗    ╚═╝\n" +
            "╚██████╔╝ ╚████╔╝ ███████╗██║  ██║    ██╗\n" +
            " ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝    ╚═╝";


}