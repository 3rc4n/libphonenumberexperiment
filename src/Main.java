import com.google.i18n.phonenumbers.PhoneNumberUtil;

public class Main {
    public static void main(String[] args)
    {
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        System.out.println("Output: " + phoneNumberUtil.getRegionCodeForCountryCode(49));
    }
}