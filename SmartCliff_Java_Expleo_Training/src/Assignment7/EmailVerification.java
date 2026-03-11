package Assignment7;

import java.util.*;

public class EmailVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		char[] a = st.toCharArray();
		if (st.contains("@")) {
			for (int i = 0; i < st.length(); i++) {
				if (!(a[0] >= 'a' && a[0] <= 'z'))
					return;
				if ((a[i] == '.' && a[i + 1] == '.') || (a[i] == '_' && a[i + 1] == '_')
						|| (a[i] == '-' && a[i + 1] == '-') || (a[i] == '-' && a[i + 1] == '_')
						|| (a[i] == '_' && a[i + 1] == '.') || (a[i] == '.' && a[i + 1] == '_')
						|| (a[i] == '-' && a[i + 1] == '.') || (a[i] == '@' && a[i + 1] == '_')
						|| (a[i] == '@' && a[i + 1] == '-') || (a[i] == '@' && a[i + 1] == '.')
						|| (a[i] == '-' && a[i + 1] == '@') || (a[i] == '.' && a[i + 1] == '@')
						|| (a[i] == '_' && a[i + 1] == '@'))
					return;

			}
		} else
			return;
		System.out.println(st);
	}

}
