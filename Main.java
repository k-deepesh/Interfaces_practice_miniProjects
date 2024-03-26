public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone("7997637337","9652656029");
        System.out.println(phone.makeCall());
        SmartPhone smartPhone=new SmartPhone("7997637337","9652656029",true,true,true,true);
        smartPhone.browseInternet();

    }
}
public interface Communication {
    public String makeCall();

    public String sendSMS();

    public String recieveCall();
}
class Phone implements Communication {
    private String senderNumber;
    private String yourNumber;
    public Phone(String senderNumber,String yourNumber){
        this.senderNumber=senderNumber;
        this.yourNumber=yourNumber;

    }
    @Override
    public String makeCall() {
        return "Making a call to "+senderNumber+" from "+yourNumber;
    }

    @Override
    public String sendSMS() {
        return "Sending a message to "+senderNumber+" from "+yourNumber;
    }

    @Override
    public String recieveCall() {
        return "Recieving a call from "+senderNumber;
    }
}

class SmartPhone implements Communication {
    private String senderNumber;
    private String yourNumber;
    public SmartPhone(String senderNumber,String yourNumber,boolean hasConnectivity,boolean hasMultimediaConnectivity,boolean hasInternetOption,boolean hasAppIntegration){
        this.senderNumber=senderNumber;
        this.yourNumber=yourNumber;
        this.hasAppIntegration=hasAppIntegration;
        this.hasConnectivity=hasConnectivity;
        this.hasInternetOption=hasInternetOption;
        this.hasMultimediaConnectivity=hasMultimediaConnectivity;

    }

    private boolean hasInternetOption;
    private boolean hasConnectivity;
    private boolean hasAppIntegration;
    private boolean hasMultimediaConnectivity;

    @Override
    public String makeCall() {
        return "Making a call to "+senderNumber+" from "+yourNumber;
    }

    @Override
    public String sendSMS() {
        return "Sending a message to "+senderNumber+" from "+yourNumber;
    }

    @Override
    public String recieveCall() {
        return "Recieving a call from "+senderNumber;
    }
    public void browseInternet() {
        if (hasInternetOption && hasConnectivity) {
            System.out.println("Browsing the internet on the smartphone.");
        }
        else
            System.out.println("Browsing the internet is not possible.");

    }

    public void installApp(String appName) {
        if (hasAppIntegration) {
            System.out.println("Installing app: " + appName);
        } else {
            System.out.println("App installation not supported.");
        }
    }
}



