
public class User {
  private int rankValue;
  private int progress;

  public User() {
    this.rankValue = -8; 
    this.progress = 0;
  }

  public int rank() {
    if (this.rankValue > -1) {
      return this.rankValue + 1;
    } else {
      return this.rankValue;
    }
  }

  public void incProgress(int task) {
    if (task > 0) {
      task -= 1;
    }
    if (this.rankValue == 7) {
      return;
    }

    if ((task+1)==this.rankValue){
      this.progress += 1;
    } else if (task == this.rankValue){
      this.progress += 3;
    } else if (task > this.rankValue) {
      this.progress += (10 * Math.pow(Math.abs(task - this.rankValue), 2));
    }
    int lvlUp = this.progress / 100;
    this.progress %= 100;
    this.rankValue += lvlUp;

    if (this.rankValue >= 7) {
      this.rankValue = 7;
      this.progress = 0;
    }
  }
}
