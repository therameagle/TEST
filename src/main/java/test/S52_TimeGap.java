package test;

public class S52_TimeGap {
	//time Difference
	String timeGap(String st, String et) {
		String[] sP = st.split(":");
		int sH = Integer.parseInt(sP[0]);
		int sM = Integer.parseInt(sP[1]);
		int sS = Integer.parseInt(sP[2]);
		String[] eP = et.split(":");
		int eH = Integer.parseInt(eP[0]);
		int eM = Integer.parseInt(eP[1]);
		int eS = Integer.parseInt(eP[2]);
		int sTotalSeconds = sH * 3600 + sM * 60 + sS;
		int endTotalSeconds = eH * 3600 + eM * 60 + eS;
		int durationSec = endTotalSeconds - sTotalSeconds;
		if (durationSec < 0) {
			durationSec += 24 * 3600;
		}
		int hours = durationSec / 3600;
		int minutes = (durationSec % 3600) / 60;
		int seconds = durationSec % 60;
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
	
}

