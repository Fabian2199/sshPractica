import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class ejec{
	public static void main(String[] args) {
		try {
			String path = "/home/fabian/sshPractica/archivo.sh";
			String [] command = {"sh", path};
			Process process = Runtime.getRuntime().exec(command);
			
			String commandRead;
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while((commandRead = stdInput.readLine()) != null) {
				Logger.getGlobal().info(commandRead);
			}
			process.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
