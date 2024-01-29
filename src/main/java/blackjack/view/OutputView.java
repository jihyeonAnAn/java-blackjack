package blackjack.view;

import blackjack.Dealer;
import blackjack.Player;

import java.util.ArrayList;
import java.util.List;

import static blackjack.message.MessageConst.*;

public class OutputView {

    public void startGameMsg() {
        System.out.println(START_GAME_MSG);
    }

    public void giveCardMsg(List<Player> playerList) {
        List<String> playerNameList = new ArrayList<>();
        for (Player player : playerList) {
            playerNameList.add(player.getName());
        }
        String player = String.join(",", playerNameList);
        System.out.println("\n딜러와 " + player + GIVE_CARD_MAG);
    }

    public void stayOrHitMsg(Player player) {
        System.out.println(player.getName() + STAY_OR_HIT_MSG);
    }

    public void printStateInputErrorMsg() {
        System.out.println(ERROR_STAY_OR_HIT_INPUT_MSG);
    }

    public void printDealerGetMoreCardMsg() {
        System.out.println(DEALER_GET_MORE_CARD_MSG + "\n");
    }

    public void printGameResult(Dealer dealer, List<Player> playerList) {
        dealer.printDealerResult();
        for (Player player : playerList) {
            player.printPlayerResult();
        }
        System.out.println("\n" + FINAL_WINNER + "\n");
        ;
    }

    public void printGameWinner(int win, int lose, List<Player> playerList) {
        System.out.println("딜러: " + win + "승 " + lose + "패");
        for(Player player: playerList){
            System.out.println(player.getName() + ": " + player.getGameResult());
        }
    }
    public void printSumCardNumberOver() {
        System.out.println(SUM_CARD_NUMBER_OVER);
    }
}
