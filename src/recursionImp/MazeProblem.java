package recursionImp;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(pathCount(3,3));
        path("",3,3);
        System.out.println(pathReturn("",3,3));
        System.out.println(pathReturnDiagonal("",3,3));

        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        System.out.println(pathwithRestrictions("",board,0,0));
    }

    static int pathCount(int r , int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = pathCount(r-1,c);
        int right = pathCount(r,c-1);

        return left + right;
    }

    static void path(String p , int r , int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'D', r - 1, c);
        }
        if(c > 1){
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathReturn(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathReturn(p + 'D', r - 1, c));
        }
        if(c > 1){
            list.addAll(pathReturn(p + 'R', r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathReturnDiagonal(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathReturnDiagonal(p + 'D',r - 1, c - 1));
        }
        if(r > 1){
            list.addAll(pathReturnDiagonal(p + 'V', r - 1, c));
        }
        if(c > 1){
            list.addAll(pathReturnDiagonal(p + 'H', r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathwithRestrictions(String p , boolean[][] maze, int r , int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c]) {
            ArrayList<String> list2 = new ArrayList<>();
            list2.add(p);
            return list2;
        }

        if(r < maze.length - 1 && c > maze[0].length - 1){
            list.addAll(pathwithRestrictions(p + 'D', maze ,r + 1, c + 1));
        }
        if(r < maze.length - 1){
            list.addAll(pathwithRestrictions(p + 'V', maze ,r + 1, c));
        }
        if(c < maze[0].length - 1){
            list.addAll(pathwithRestrictions(p + 'H', maze ,r, c + 1));
        }

        return list;
    }
}
