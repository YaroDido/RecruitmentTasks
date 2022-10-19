package CodeGym;

public class Solution5 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getOpis());
    }

    public static class Idea {
        public String getOpis() {
            return "This is description";
        }
    }
}

