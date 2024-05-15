public class MessageDecorator implements Message {
    private TextMessage message;

    public MessageDecorator(TextMessage message){
        this.message = message;
    }
    @Override
    public void sendMessage(String text) {
        message.sendMessage(text);
    }

    @Override
    public void getMessage() {

        System.out.println(message.getText() + " сообщение доставлено");
    }
}
