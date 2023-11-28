package w12;

public class Call {
    private String callType;
    private String startCall;
    private String endCall;
    private String caller;
    private String recipient;

    public Call() {
        this.callType = "";
        this.startCall ="";
        this.endCall = "";
        this.caller = "";
        this.recipient = "";

    }

    public String getCallType() {
        return callType;
    }

    public String getStartCall() {
        return startCall;
    }

    public String getEndCall() {
        return endCall;
    }

    public String getCaller() {
        return caller;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public void setStartCall(String startCall) {
        if (startCall.isEmpty()) {
            System.out.println("Start time cannot be empty.");
        } else {
            this.startCall = startCall;
        }
    }
    public void setEndCall(String endCall) {
        if (endCall.isEmpty()) {
            System.out.println("End time cannot be empty.");
        } else {
            this.endCall = endCall;
        }
    }
    public void setCaller(String caller) {
        if (caller.startsWith("+") && caller.length() ==11){
            this.caller = caller;
        }else{
            System.out.println("Invalid caller phone number.");
        }
    }


    public void setRecipient(String recipient) {
        if (recipient.startsWith("+") && recipient.length() == 11) {
            this.recipient = recipient;
        }else{
            System.out.println("Invalid recipient phone number.");
        }
    }
    public void displayCallDetails(){
        System.out.println("Call Type: " +callType);
        System.out.println("Start Time: " + startCall);
        System.out.println("End Time: "+ endCall);
        System.out.println("Caller: "+ caller);
        System.out.println("Recipient: "+ recipient);
    }

    public static void main(String[] args) {
        Call call = new Call();
        call.setCallType("OUTBOUND");
        call.setStartCall("09:30:00");
        call.setEndCall("09:45:30");
        call.setCaller("+1234567890");
        call.setRecipient("+9876543210");

        call.setEndCall("09:48:15");
        call.displayCallDetails();

        call.displayCallDetails();
    }

}
