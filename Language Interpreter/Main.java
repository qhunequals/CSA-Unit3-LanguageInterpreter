// Language Interpreter Starter   A+CR
class Main {

    public static void main(String[] args) {
          Lexicon speak = new Lexicon();
          
          // Start typing your code below:
          String sample = "";
          String original = "";
      for (int f = 0; f < 16; f++){
          sample = speak.getSample(f);
          original = sample;
          for (int i=0 ; i < sample.length() - 4; i++){
            if (sample.substring(i,i + 4).equals("ingy")){
                  sample = sample.substring(0, i) + sample.substring(i + 4);
            }
            else if (sample.substring(i,i + 3).equals("ent")){
                  sample = sample.substring(0, i) + sample.substring(i + 3);
            }
          }          
          System.out.println("(" + original + ")");
          System.out.println("translates to:");
          System.out.println("(" + sample + ")");
          System.out.println();
          System.out.println();
          
          // All of your code should be above this line
    }
}
  }
