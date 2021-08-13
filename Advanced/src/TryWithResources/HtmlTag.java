package TryWithResources;

public class HtmlTag implements AutoCloseable{

    String em;


    public HtmlTag(String em) {
        this.em = em;
        System.out.println("<" + em + ">");
    }

    public void body(String text){
        System.out.println(text);
    }

    public void close(){
        System.out.println("</" + em + ">");
    }

    public static void main(String[] args) {

        try(
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em")

        ) {
            em.body("mój tekst");
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
