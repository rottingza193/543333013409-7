package com.rmuti.foolball;

public class MesutOzil {


		String Arsanal;
		public MesutOzil(String MO){
			Arsanal = MO;
		}
		public static void main (String[] args){
			MesutOzil a = new MesutOzil("Rotting");
			MesutOzil a2 = new MesutOzil("SF");
			MesutOzil a3 = new MesutOzil("Lukas Podolski!!Jack Wilshere!!Theo Walcott!!Olivier Giroud");
			a.names();
			a2.posit();
			a3.Friendss();
		}
		void names(){
			System.out.println("Name :"+Arsanal);
		}
		void posit(){
			System.out.println("Position :"+Arsanal);
		}
		void Friendss(){
			System.out.println("Friend :"+Arsanal);
		}
		}
				