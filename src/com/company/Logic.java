package com.company;

import java.util.ArrayList;

public class Logic {
    public static char[][] reseni() {

        String a  = "#######++++++++++####S##################\n" +
                "#######+#####++#+####+##################\n" +
                "###+###+#####++#+####+##################\n" +
                "###++++++++++++#++++++##################\n" +
                "###+#+#+##+###+#+#+##+++++++++++#+######\n" +
                "#+#+++#+##+++++###+##+#+###+#+#+#+######\n" +
                "#++++++++++###+++++##+#+++++++++++######\n" +
                "#+########+###+##++####+#+#+##++#+######\n" +
                "#+####++++++++++++++++#+#+#+##++#+######\n" +
                "#+####+##########+++#+###+++++++++++++##\n" +
                "#++++++##########+++++++#+#+###+####+###\n" +
                "#+#++++########++++###+##+#+###+####+###\n" +
                "#+##+#+##########++###+##++++++++++++###\n" +
                "+++++#+#########+++++++##++#####+###+###\n" +
                "####+#+#############+#+##++#####+###+###\n" +
                "##+++++#######+++###+#+++++#####+###+###\n" +
                "######+#######+#####+++++++#####+++++###\n" +
                "##############+#######+#+++++###+#+#####\n" +
                "#############++++++++++#+#######+#+#####\n" +
                "###################+##+#+###############\n" +
                "###################++++++++++###########\n" +
                "###################+#+####+#############\n" +
                "########+##########+#+####+#####+#######\n" +
                "########+##########+#++++++++++++++#####\n" +
                "########++++++++++++#+#+##+#++##+#+#####\n" +
                "########+##+##+##+##++#++++#+++++++#####\n" +
                "######+#+##+##+##++++##++++##+##########\n" +
                "######+#+##++++++++++##+##+##+##########\n" +
                "######++++++++##++#++##++++++++#########\n" +
                "######+#+##+##+++++++##+################\n" +
                "######+#++++##+#+##++##+################\n" +
                "######+#+++++++#+##+++++################\n" +
                "######+#+##+++++++++++#+################\n" +
                "######+++++++#++###+#++++####+++########\n" +
                "######+####++#++++++++##+######+########\n" +
                "######+####++#+###+++++++++++##+########\n" +
                "#####++++++++#####+##+######+##+++++++++\n" +
                "##########+++#####+##+######+##+##+###+#\n" +
                "########+++++###++++++######++++##++++++\n" +
                "########+#+++########+#+####++++##+##+#+\n" +
                "########+##+++++++++#+#+####+#++++++++++\n" +
                "+++++++++##+#+###+++++++##+#++++#+##+##+\n" +
                "##+##+##+##+#+###++++##+##+#+##+#+##++++\n" +
                "+++##+##++++++###+##+##+##+#+##+++##+###\n" +
                "+#+##+++++++++###+##+##+++++++++++##+###\n" +
                "++++++++++##++###+##+##+#####+#+#+##+###\n" +
                "+####+######++++++##++++++++#++++++++###\n" +
                "+##+++++++++++#+#+##+#+######+#+#+##+###\n" +
                "+##+#####+#+++++#+##+#+######+#+#+++++++\n" +
                "+++++++##+#+###+#+++++++++++++++#+######\n" +
                "+##+##+##+++++++#++#######+####+++######\n" +
                "+++++++##+########+#######++++++#+######\n" +
                "######+##+#++++++++#####+####+#+#+++++++\n" +
                "####++++++#+###+##+++###+####+###+#+####\n" +
                "#########+#+###+##+#+###+####+++#+#+####\n" +
                "#########+#++++++++++++++++##+++#+#+++++\n" +
                "#########+#+##+#####+########+#+#+++++##\n" +
                "#########++++++#####+########+++++#+#+##\n" +
                "##########################++++++++++++##\n" +
                "###########################+##+######+##\n" +
                "###########################++++#########\n" +
                "###########################+#++#########\n" +
                "###########################+++++++######\n" +
                "###########################+#+++#+######\n" +
                "###########################+#+#+#+###+##\n" +
                "###########################+#+#+#+###+##\n" +
                "########################+##+++++++++++++\n" +
                "########################+++++##+########\n" +
                "########################+++#+##+########\n" +
                "#################++++++#+#+#+##+########\n" +
                "#################+##++++++++++++########\n" +
                "#################+###+####+####+########\n" +
                "#################+###+####+####+########\n" +
                "#################+++++####+#############\n" +
                "#################++#+++++++++###########\n" +
                "#################+++++##+###+###########\n" +
                "#############+++++++++##+++++###########\n" +
                "#############+#####++++++#+#+###########\n" +
                "#############+#####+++####+++###########\n" +
                "############++++++++++####+#++++++######\n" +
                "################+####+####+#+##+########\n" +
                "################+####+###+##+##+########\n" +
                "###+############+####+++++++++++########\n" +
                "###+############+#######++###+##########\n" +
                "++++############++++++++++++++##########\n" +
                "+##+############+####+#+################\n" +
                "+##+############+####+#+################\n" +
                "++++#++++++++++++####+#+################\n" +
                "+##+#+###+#+##+#+####+#++++++++#########\n" +
                "+##+#+##+++++++++####+#+##+###+#########\n" +
                "+##++++++##+##+#+++++++++++###+#########\n" +
                "+##+####+##+##+#+#+##+###++++++#+#######\n" +
                "+##+#+++++++##+++++##+######+#+#+#+#####\n" +
                "++++++#####+##+###+##++++++++#+++#+#####\n" +
                "+#+##+#####+##+###+##+###+##+###+#++++++\n" +
                "+++##+#####+++++++++++###+##+###+#+##+##\n" +
                "+#++++++###+##+###++#+###+######++++++##\n" +
                "+#+###++++++++++++++#+###+++++++++++++##\n" +
                "+#+###+#+#####+##+++++++++##+###+#++#+##\n" +
                "+++++++++##+++++++++#+##++##+###++++#+##\n" +
                "+##+####+#######+++++++++++++###++++#+++\n" +
                "++++####+###############+#+#+###+##+#+##\n" +
                "###+####+###############+#+#+#++++++++#+\n" +
                "###+####+###############+#+#+++######+#+\n" +
                "#++++++++###############+#+++++++++##+#+\n" +
                "#+###+#############++++++#+#+#+##+###+++\n" +
                "++++++###########+++#+##+#+#+#++++###+##\n" +
                "#+#+#+#####+#######+#+##+#+#+#+++++++++#\n" +
                "#+#+#+###+++#######+#+##+++++#+#+#######\n" +
                "#+++++++++#+###+###++++++++#+#+++#+#####\n" +
                "#+######++++###+###+##+##++++++++++#####\n" +
                "#+######+##+###+###++++###########+#+###\n" +
                "########++++++++++++#++######++++++++###\n" +
                "########+#####+++++++++#######+#####+###\n" +
                "########+#####+##+####+#######+#####+###\n" +
                "########++++++++++####+++++++++#####+###\n" +
                "##########+###########+####+##+#####++++\n" +
                "##########+###########+####+########+###\n" +
                "########+++#######+++++#+++++++#####+###\n" +
                "########+#+#####++++##+##+#++#+++++++###\n" +
                "########+#+#######++++++++#++#++#+##+###\n" +
                "#####++++++#######++++###+++++++#+##+###\n" +
                "######+#+#+#######++++###+##+#++#+++++++\n" +
                "######+++++++++###++++++++++++++++######\n" +
                "######+++++++#+###+##+#+##+#+##+#+######\n" +
                "#++++++++++++#+###+##+#+##+#+##+#+######\n" +
                "##+##+###+##+++###++++++##++++++++######\n" +
                "++++++###+####+###+#+##+##+#+####+######\n" +
                "###+#+###++++++###+#+#####+#+####+##++++\n" +
                "#+++#+###++##++++++++##+####+++++++++#++\n" +
                "###+++###++##+######+##+####+##+###+++++\n" +
                "###+#+#+++++++###+##++++####+##+++++###+\n" +
                "++++#+#######+###+##+##++++++++++#++++++\n" +
                "#+#+#+#######+###++++++++######+++++####\n" +
                "#+++++++#########+##+###+######+##++####\n" +
                "#+#+#+#+#########+##+###+####+++++++####\n" +
                "#+#+++++#########+##+###+##########+####\n" +
                "#++++##++++++++++++++++++++++###+##+####\n" +
                "#+#++##+##+###+##+###+##+###+###+##+####\n" +
                "#+#++++++++###++++###+##+++++##+++++####\n" +
                "#+#++#+#+#+###+++++++++++#+#+###########\n" +
                "++#++#+++#++++++####+++++#+++###########\n" +
                "++++++++++++##++####+#+#+#+#+###########\n" +
                "#+#+######++++++####+#+#+#+#+++#########\n" +
                "++#+######++++++####+++#++++++++++++####\n" +
                "#++++++++++#+##++++++#+#+##++#+##+#+####\n" +
                "#+####+##++#+##+##+#+######++++##+++####\n" +
                "#+#+##+++++++++++++#+#++++++++++++++####\n" +
                "++++##+##+########+#+####+#+###+++++####\n" +
                "###+##+##+##########++++++#+###++##+####\n" +
                "###+##+++++##+###+##+#+##+++++++++++++++\n" +
                "###+##++#####+###++++++##+##+######+##+#\n" +
                "###+++++++++++###+##+++##+##+++++++++++#\n" +
                "+##+######+##+###+##+####+##+##++++++++#\n" +
                "+##+######+##+#+++##+#######+##+##+++++#\n" +
                "+##+###++++##+#+#+##+#######+++++++###+#\n" +
                "++++###+#++##+#+#++++#######+##+##+###+#\n" +
                "###+###+#++##+#++++++#######+##+++++##++\n" +
                "###++++++++##+++#+##+#######+##+###+##+#\n" +
                "######+##+++++#+#+##+##+#######+#++++++#\n" +
                "######+##++##+#+++++++++#####+++#+######\n" +
                "#####+++++++++++##+####+#######+#+######\n" +
                "##################+####+#######+#++++###\n" +
                "################+#++++#+++++++++#+##+###\n" +
                "################+#+##+#+##+####+++++++++\n" +
                "################++++++#+##+#+###+###+#+#\n" +
                "################+####++++++++###+###+#++\n" +
                "#########+######+####++++++#+###++++++++\n" +
                "#########+######++###++#+#+++++++##++##+\n" +
                "###+++++++++++++++###++#+#++####+##++##+\n" +
                "####+##+#+#+##+#++++++++++++####+++++##+\n" +
                "####++++++#+##++++++#####+#+####+###+##+\n" +
                "####+##+++++####+##+#####+#++++++++++###\n" +
                "####+##+###+####++++#####++++++++++++###\n" +
                "####+##+#+#+####+#++++++++##+###########\n" +
                "++++++++#+#+####+#++#+###+##+###########\n" +
                "#+#+++++++++++++++++++++++##+###########\n" +
                "#+#+#########+########++++++############\n" +
                "#+++++#######+########+++##+############\n" +
                "#+###########+##+++++#++###+############\n" +
                "#############+++++##+#++###+############\n" +
                "#############+#+#++++++++++++++++++#####\n" +
                "#########+###+#+#+#+##+++#++######+#####\n" +
                "#########+#####+#+++###+++++######+#####\n" +
                "#########+++++++++#+###++##+############\n" +
                "#########++#+##++++++++++##++++++#######\n" +
                "#########++#+##+####+##++##+##+#########\n" +
                "#########++++##+####+##++##++++####++###\n" +
                "#########++++++++++++++++++++++###+#+###\n" +
                "#########+#++##+#+##+#########+##++++###\n" +
                "#########+#++##+#+##+#########+##+##+###\n" +
                "#####+++++++++++++##+#########+#########\n" +
                "######+####++#+##+##+++++++++###+#+#####\n" +
                "######+++++++++##+##++++##+#####+++#####\n" +
                "######+##+##+#+##+++++#+##+++++++#######\n" +
                "#####+++++##+#+##++##+#++++#############\n" +
                "#######++++++++##+++++++##+#############\n" +
                "#######+#+####+########+##+#############\n" +
                "#######++++++++++######+##+#############\n" +
                "#######+##F###############+#############\n";

        String[] b = a.split("\n");
        char[][] maze = new char[b.length][b[0].length()];
        for (int j = 0; j < b.length; j++) {
            maze[j] = b[j].toCharArray();
        }


        ArrayList<Coordinate> cesta = new ArrayList<>();
        ArrayList<Coordinate> nejkratsi = new ArrayList<>();
        ArrayList<Coordinate> navstivene = new ArrayList<>();

        //---Start-------
        Coordinate start = new Coordinate();
        for (int i = 0; i < maze.length; i++) {
            for (int i1 = 0; i1 < maze[i].length; i1++) {
                if(maze[i][i1] == 'S') {
                    start.x = i1;
                    start.y = i;
                    maze[i][i1] = '+';
                    break;
                }
            }
        }

        //------Konec--------
        Coordinate end = new Coordinate();
        for (int i = 0; i < maze.length; i++) {
            for (int i1 = 0; i1 < maze[i].length; i1++) {
                if(maze[i][i1] == 'F') {
                    end.x = i1;
                    end.y = i;
                    maze[i][i1] = '+';
                    break;
                }
            }
        }

        cesta(maze, start, end, cesta, nejkratsi, navstivene);
        for (Coordinate coordinate : nejkratsi) {
            maze[coordinate.y][coordinate.x] = 'x';
        }

        maze[end.y][end.x] = 'F';
        maze[start.y][start.x] = 'S';


        return maze;
    }

    public static boolean jeNaKonci(Coordinate end, Coordinate coords) {
        return end.x == coords.x && end.y == coords.y;
    }

    public static Coordinate dalsiPozice(int x, int y, int posunX, int posunY) {
        Coordinate coord = new Coordinate();
        coord.x = x + posunX;
        coord.y = y + posunY;
        return coord;
    }

    public static boolean chybneMisto(int x, int y, char[][] maze, ArrayList<Coordinate> navstivene) {
        if (0 <= x && 0 <= y && maze[0].length > x && maze.length > y && maze[y][x] == '+' && !jeNavstivene(navstivene, x, y))
            return false;
        return true;
    }

    public static boolean jeNavstivene(ArrayList<Coordinate> navstivene, int x, int y) {
        for (Coordinate coordinate : navstivene) {
            if (coordinate.x == x && coordinate.y == y) return true;
        }
        return false;
    }

    public static boolean cesta(char[][] maze, Coordinate coords, Coordinate end, ArrayList<Coordinate> cesta, ArrayList<Coordinate> nejkratsi, ArrayList<Coordinate> navstivene) {
        if (chybneMisto(coords.x, coords.y, maze, navstivene)) return false;
        navstivene.add(coords);
        cesta.add(coords);

        if (jeNaKonci(end, coords)) {
            if (nejkratsi.isEmpty() || nejkratsi.size() > cesta.size()) {
                nejkratsi.clear();
                nejkratsi.addAll(cesta);
            }
            return false;
        }

        Coordinate misto = dalsiPozice(coords.x, coords.y, 0, 1);
        if (cesta(maze, misto, end, cesta, nejkratsi, navstivene)) return true;
        misto = dalsiPozice(coords.x, coords.y, 1, 0);
        if (cesta(maze, misto, end, cesta, nejkratsi, navstivene)) return true;
        misto = dalsiPozice(coords.x, coords.y, -1, 0);
        if (cesta(maze, misto, end, cesta, nejkratsi, navstivene)) return true;
        misto = dalsiPozice(coords.x, coords.y, 0, -1);
        if (cesta(maze, misto, end, cesta, nejkratsi, navstivene)) return true;

        cesta.remove(cesta.size() - 1);
        return false;
    }
}

