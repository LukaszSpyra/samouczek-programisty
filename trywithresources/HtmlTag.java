package pl.samouczekprogramisty.trywithresources;

public class HtmlTag implements AutoCloseable{

    String tag; //lepiej private final jako ze ten znacznik ma byc niezmienny

    public HtmlTag(String tag) {
        this.tag = tag;
        System.out.println("<" + tag + ">");
    }

    public void body(String text){
        System.out.println(text);
    }

    public void close(){
        System.out.println("</" + tag + ">");

    }

    public static void main(String[] args) {
        try (
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em")
        ) {
            h1.body("tekst nr 2");
            em.body("moj tekst");
        }

    }
}
