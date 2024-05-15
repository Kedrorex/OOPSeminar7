public class TextMessage implements Message {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextMessage(String text){
        this.text = text;
    }
    @Override
    public void sendMessage(String text){
        this.text = text;
    }

    @Override
    public void getMessage(){
        System.out.println(text);
    }
}
