package dataArtCourse;

// Guaranteeing proper cleanup of a resource.
public class Main {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("D:\\IdeaProjects\\JavaBookThinkingInJava\\src\\dataArtCourse\\Main.java");
            try {
                String s;
                int i = 1;
                while((s = in.getLine()) != null) {
                    // Perform line-by-line processing here...
                    System.out.println(i + " " + s);
                    i++;
                }
            } catch(Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch(Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
