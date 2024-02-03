public class R_2GameEnter {
    int score;

    public R_2GameEnter(int score) {
        this.score = score;
    }
        public static void main(String[] args) {
            R_2GameEnter[] W = new R_2GameEnter[5];
            // ملء مصفوفة W بكائنات GameEntry
            for (int i = 0; i < W.length; i++) {
                W[i] = new R_2GameEnter(i * 100);
            }

            R_2GameEnter[] q= W.clone();

            W[4].score = 550;

            int scoreOfB4 = q[4].score;
            System.out.println("Score value of q[4]: " + scoreOfB4);
        }
    }
