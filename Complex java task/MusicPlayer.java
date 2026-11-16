


import java.util.Scanner;

    public class MusicPlayer {

        String[] songs = {"Arirang", "Kante", "Unavailable"};
        int currentSong = 0;
        boolean isPlaying = false;

        public void play() {
            isPlaying = true;
            System.out.println("Now playing: " + songs[currentSong]);
        }

        public void pause() {
            isPlaying = false;
            System.out.println("Music paused");
        }

        public void stop() {
            isPlaying = false;
            System.out.println("Music stopped");
        }

        public void nextSong() {
            if (currentSong < songs.length - 1) {
                currentSong++;
            } else {
                currentSong = 0;
            }
            System.out.println("Next song: " + songs[currentSong]);
        }

        public void previousSong() {
            if (currentSong > 0) {
                currentSong--;
            } else {
                currentSong = songs.length - 1;
            }
            System.out.println("Previous song: " + songs[currentSong]);
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            MusicPlayer player = new MusicPlayer();

            int choice;

            do {
                System.out.println("\nMUSIC PLAYER");
                System.out.println("1. Play");
                System.out.println("2. Pause");
                System.out.println("3. Stop");
                System.out.println("4. Next Song");
                System.out.println("5. Previous Song");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        player.play();
                        break;

                    case 2:
                        player.pause();
                        break;

                    case 3:
                        player.stop();
                        break;

                    case 4:
                        player.nextSong();
                        break;

                    case 5:
                        player.previousSong();
                        break;

                    case 0:
                        System.out.println("Music player closed");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 0);

        }
    }


