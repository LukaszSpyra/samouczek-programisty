package pl.samouczekprogramisty.streams;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class LoopToStreams {

    public static void main(String[] args) {
        LoopToStreams.loopsMethod();
        LoopToStreams.streamsMethod();
        LoopToStreams.streamsMinMethod();
        LoopToStreams.streamsReduceMinMethod();
    }

private static void loopsMethod() {
        double highestRanking = 0;
        BoardGame bestGame = null;
        for (BoardGame game : BoardGame.GAMES) {
            if (game.name.contains("a")) {
                if (game.rating > highestRanking) {
                    highestRanking = game.rating;
                    bestGame = game;
                }
            }
        }
        System.out.println(bestGame.name);
    }

    private static void streamsMethod() {
        BoardGame bestGame = BoardGame.GAMES
                .stream()
                .filter(g -> g.name.contains("a"))
                .max(Comparator.comparingDouble(g -> g.rating)).get();
        System.out.println(bestGame.name);
    }

    private static void streamsMinMethod() {
        BoardGame bestGame = BoardGame.GAMES
                .stream()
                .filter(g -> g.name.contains("a"))
                .min(Comparator.comparingDouble(g -> g.rating)).get();
        System.out.println(bestGame.name);
    }

    private static void streamsReduceMinMethod() {
        BoardGame bestGame = BoardGame.GAMES
                .stream()
                .filter(g -> g.name.contains("a"))
                .reduce(BinaryOperator.minBy(Comparator.comparingDouble(g->g.rating))).get()
                ;
        System.out.println(bestGame.name);
    }
}