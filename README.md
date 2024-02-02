# Codewars style ranking system
Had to not validate although my class is working as i would have to remodel my format for working around the weird ranking system to a sort of enum.
Ex:
 private int[] ranks = {-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};
  private int curRank = 0;
  public int progress = 0;
  public int rank = -8;
  private void updateRank() {
    rank = ranks[curRank];
  }
