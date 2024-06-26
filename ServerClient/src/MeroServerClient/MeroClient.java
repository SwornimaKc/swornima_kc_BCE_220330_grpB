package MeroServerClient;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class MeroClient {
	public static void main(String[] args){
        try {
            System.out.println("waiting for server...");
            Socket socket =new Socket("localhost",8888);
            System.out.println("connected with server..");
            //sending data to server
          DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
            dos.write(3);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
           String receive = dis.readUTF();
            System.out.println(receive);
            dos.flush();
            socket.close();



        }catch(UnknownHostException e){
            e.printStackTrace();

        }
        catch (IOException e) {
           e.printStackTrace();
        }


    }


}
