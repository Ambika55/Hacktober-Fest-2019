package assignment;

import java.util.*;

public class RatChasesCheeaw {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int er = scn.nextInt();
		int ec = scn.nextInt();
		char[][] a = new char[er][ec];
		for (int i = 0; i < er; i++) {
			String input = scn.next();
			for (int j = 0; j < ec; j++)
				a[i][j] = input.charAt(j);
		}
		boolean[][] visit = new boolean[er][ec];
		int[][] visited = new int[er][ec];
		mazepath(a, 0, 0, er, ec, "", visit, visited);
		if (visited[er - 1][ec - 1] == 1) {
			for (int i = 0; i < er; i++) {
				for (int j = 0; j < ec; j++)
					System.out.print(visited[i][j] + " ");
				System.out.println();
			}
		} else
			System.out.println("NO PATH FOUND");
	}

	public static void mazepath(char[][] a, int cr, int cc, int er, int ec, String ans, boolean[][] visit,
			int[][] visited) {
		if (cr == er - 1 && cc == ec - 1) {
			for (int i = 0; i < er; i++)
				for (int j = 0; j < ec; j++)
					if (visit[i][j])
						visited[i][j] = 1;
			visited[er - 1][ec - 1] = 1;
			return;
		}
		if (cr < 0 || cr >= er || cc < 0 || cc >= ec || a[cr][cc] == 'X' || visit[cr][cc])
			return;

		visit[cr][cc] = true;
		mazepath(a, cr + 1, cc, er, ec, ans + "b", visit, visited);
		mazepath(a, cr, cc + 1, er, ec, ans + "r", visit, visited);
		mazepath(a, cr - 1, cc, er, ec, ans + "t", visit, visited);
		mazepath(a, cr, cc - 1, er, ec, ans + "l", visit, visited);
		visit[cr][cc] = false;
	}
}
