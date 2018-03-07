package studio5;

import jssc.SerialPortException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HexTx {
	public static void main(String[] args) throws SerialPortException, IOException {		
		// TODO:  Fix this: 
		//           a) Uncomment to create a SerialComm object
		//           b) Update the "the port" to refer to the serial port you're using
		//              (The port listed in the Arduino IDE Tools>Port menu.		
		//           c) Deal with the unresolved issue
		Scanner in = new Scanner(System.in);
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input = in.nextInt();
		while(input > 15 || input < 0) {
			System.out.println("invalid input. try again");
			input = in.nextByte();
		}
		System.out.println(input);
		SerialComm port = new SerialComm("COM3");
		port.setDebug(true);
		port.writeByte((byte) input);
		
		// TODO: Complete section 6 of the Studio (gather sanitized user input
		//       and send it to the Arduino)
	}

}
