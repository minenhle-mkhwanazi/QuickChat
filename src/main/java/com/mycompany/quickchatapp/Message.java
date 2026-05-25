package com.mycompany.quickchatapp;
public class Message {
 
    private String message;  // single message instead of ArrayList
    boolean sendMessage;

    Message(String string, String hidid_you_receive_the_payment) {
        // Store the first string as the message
        this.message = string + " | " + hidid_you_receive_the_payment;
    }
    
    public boolean checkMessageID(String id){
        return id.length() <= 10;
    }

    public String checkRecipientCell(String cellNumber){
        if (cellNumber.length() <= 10 && cellNumber.matches("\\d+")){
            return "Cell phone number successfully captured.";
        }
        return "Cell phone number is incorrectly formatted. Please correct the number and try again";
    }

    public String createMessageHash(String message, int numMessages){
        String[] words = message.split(" ");
        return String.format("%02d:%02d:%s:%s",
                0, numMessages,
                words[0].toUpperCase(),
                words[words.length-1].toUpperCase());
    }

    public String sendMessage(String message){
        if(message.length() > 250){
            return "Message exceeds 250 characters, please reduce size.";
        }
        this.message = message;  // store single message
        return "Message successfully sent.";
    }

    public String printMessage(){
        return message == null ? "No message stored." : message;
    } 

    public int returnTotalMessages(){
        return message == null ? 0 : 1;
    }

    public String storeMessage(String message){
        return "{\"message\":\"" + message + "\"}";
    }

    boolean sendMessage() {
        return message != null && !message.isEmpty();
    }

    String createMessageHash() {
        if(message == null || message.isEmpty()) return "No message available.";
        return createMessageHash(message, 1);
    }

    boolean checkRecipientCell() {
        if(message == null) return false;
        return message.matches("\\d{10}");
    }
}

