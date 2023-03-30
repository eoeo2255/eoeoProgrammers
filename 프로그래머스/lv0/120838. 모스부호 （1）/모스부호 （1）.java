import java.util.*;
class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] tem = letter.split(" ");

        for (int i = 0; i < tem.length; i++) {
            String s = tem[i];
            switch (s) {
                case ".-":
                    answer.append("a");
                    break;
                case "-...":
                    answer.append("b");
                    break;
                case "-.-.":
                    answer.append("c");
                    break;
                case "-..":
                    answer.append("d");
                    break;
                case ".":
                    answer.append("e");
                    break;
                case "..-.":
                    answer.append("f");
                    break;
                case "--.":
                    answer.append("g");
                    break;
                case "....":
                    answer.append("h");
                    break;
                case "..":
                    answer.append("i");
                    break;
                case ".---":
                    answer.append("j");
                    break;
                case "-.-":
                    answer.append("k");
                    break;
                case ".-..":
                    answer.append("l");
                    break;
                case "--":
                    answer.append("m");
                    break;
                case "-.":
                    answer.append("n");
                    break;
                case "---":
                    answer.append("o");
                    break;
                case ".--.":
                    answer.append("p");
                    break;
                case "--.-":
                    answer.append("q");
                    break;
                case ".-.":
                    answer.append("r");
                    break;
                case "...":
                    answer.append("s");
                    break;
                case "-":
                    answer.append("t");
                    break;
                case "..-":
                    answer.append("u");
                    break;
                case "...-":
                    answer.append("v");
                    break;
                case ".--":
                    answer.append("w");
                    break;
                case "-..-":
                    answer.append("x");
                    break;
                case "-.--":
                    answer.append("y");
                    break;
                case "--..":
                    answer.append("z");
                    break;

            }
        }

        return answer.toString();
    }
}