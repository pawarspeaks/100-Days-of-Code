import java.net.InetAddress;
import java.net.UnknownHostException;

public class BasicInternetAddressResolutionSPI {
    public static void main(String[] args) {
        // Resolving the IP address of a domain using the default implementation
        String domain = "www.example.com";
        try {
            InetAddress[] addresses = InetAddress.getAllByName(domain);

            // Printing the resolved IP addresses
            System.out.println("Resolved IP Addresses for " + domain + ":");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
