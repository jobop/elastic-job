package com.dangdang.ddframe.job.internal.monitor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SocketUtils {

	public static String sendCommand(final String command, final int monitorPort) throws IOException {
		Socket socket = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {

			socket = new Socket("127.0.0.1", monitorPort);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			writer.write(command);
			writer.newLine();
			writer.flush();
			return reader.readLine();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
			}

			try {
				reader.close();
			} catch (Exception e) {
			}
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
	}
}
