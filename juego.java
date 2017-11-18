public class juego{

	public static void main(String [] args){

		int num_args = args.length;

		if(num_args != 3){
			System.out.println("ERROR: Debe introducir los siguientes argumentos");
			System.out.println("num_filas, num_cols, num_aliens");
		}
	
		int filas = Integer.parseInt(args[0]);
		int columnas = Integer.parseInt(args[1]);
		int aliens = Integer.parseInt(args[2]);

		if(aliens > (filas*columnas)-1){
			System.out.println("ERROR: El número de aliens no puede superar el valor " + ((filas*columnas)-1));
		}
		else{

			
			char[][] tablero = new char[filas][columnas];


			for(int i=0; i<filas; i++){			
				for(int j=0; j<columnas; j++){	
			    	tablero[i][j] = ' ';		
				}
			}

			int num_aliens = 0;

			while(num_aliens < aliens){

				boolean alien_puesto = false;	

				while(alien_puesto == false){	)
					int x_alien = (int) (Math.random()*filas);			
					int y_alien = (int) (Math.random()*columnas);		

					if(tablero[x_alien][y_alien] == ' '){		
						tablero[x_alien][y_alien] = 'A';		
						alien_puesto = true;		
					}
				}

				num_aliens++;
			
			}

			boolean jugador_puesto = false;

			while(jugador_puesto == false){
				int f_jugador = (int) (Math.random()*filas);
				int c_jugador = (int) (Math.random()*columnas);		

				if(tablero[f_jugador][c_jugador] == ' '){
					tablero[f_jugador][c_jugador] = 'P';
					jugador_puesto = true;
				}

			}

			for(int f=0; f<filas; f++){
				System.out.print("|");	

				for(int c=0; c<columnas; c++){
					System.out.print(" ");
					System.out.print(tablero[f][c]);
					System.out.print(" ");
				}

				System.out.print("|");
				System.out.println("");
			}
		}
	}
}