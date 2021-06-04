package com.onebill.javatraining.moduleprogram.musicapp.consolebased;

import java.util.Scanner;

public class MusicAPP {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		char start = 'y';
		char option;
		while (start == 'y') {
			System.out.println("1.Play a Song 2.Search a Song 3.Show all Songs 4.Operate on Songs Database");
			System.out.println("enter your choice");
			int choice = s.nextInt();

			switch (choice) {
			case 1:

				System.out.println("A.Play all song B.Play Songs Randomly C.Play a Particular Song D.exit");
				System.out.println("enter your option");
				option = s.next().charAt(0);
				SelectionOfSongs ref1 = new SelectionOfSongs();
				switch (option) {
				case 'A':

					ref1.display('A', s);
					break;
				case 'B':
					ref1.display('B', s);
					break;
				case 'C':
					ref1.display('C', s);
					break;
				case 'D':
					System.exit(0);
				default:
					System.out.println("invalid option");
					break;
				}
				break;
			case 2:
				@SuppressWarnings("unused")
				SearchSong ref2 = new SearchSong(s);
				break;
			case 3:
				@SuppressWarnings("unused")
				DisplayAll ref3 = new DisplayAll();
				break;
			case 4:
				System.out.println("A. Add Song B. Edit an existing Song  C. Delete an existing Song D.exit");
				System.out.println("enter your option");
				option = s.next().charAt(0);
				switch (option) {
				case 'A':
					@SuppressWarnings("unused")
					Changes ref4 = new Changes(s, option);

					break;
				case 'B':
					@SuppressWarnings("unused")
					Changes ref5 = new Changes(s, option);

					break;
				case 'C':
					@SuppressWarnings("unused")
					Changes ref6 = new Changes(s, option);
				case 'D':
					System.exit(0);
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("invalid");
				}
				break;

			default:
				System.out.println("invalid option");
				break;
			}
		}
		s.close();

	}

}
