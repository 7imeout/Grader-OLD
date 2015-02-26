package course;

/**
 * Grading curve setting for a <code>Course</code>.
 */
public abstract class CurveSetting {
   /**
    * Raw score borderline for a letter grade of A.
    */
   int aLine;

   /**
    * Raw score borderline for a letter grade of B.
    */
   int bLine;

   /**
    * Raw score borderline for a letter grade of C.
    */
   int cLine;

   /**
    * Raw score borderline for a letter grade of D.
    */
   int dLine;

   /**
    * Raw score borderline for a letter grade of F.
    */
   int fLine;

   /**
    * Accessor for raw score borderline for a letter grade of A.
    * @return raw score borderline for an A.
    */
   public int getALine() {
      return aLine;
   }

   /**
    * Sets the raw score borderline for a letter grade of A.
    * @param aBorderLine raw score to use as borderline for an A.
    */
   public void setALine(int aBorderLine) {
      this.aLine = aBorderLine;
   }

   /**
    * Accessor for raw score borderline for a letter grade of B.
    * @return raw score borderline for a B.
    */
   public int getBLine() {
      return bLine;
   }

   /**
    * Sets the raw score borderline for a letter grade of B.
    * @param bBorderLine raw score to use as borderline for a B.
    */
   public void setBLine(int bBorderLine) {
      this.bLine = bBorderLine;
   }

   /**
    * Accessor for raw score borderline for a letter grade of C.
    * @return raw score borderline for a C.
    */
   public int getCLine() {
      return cLine;
   }

   /**
    * Sets the raw score borderline for a letter grade of C.
    * @param cBorderLine raw score to use as borderline for a C.
    */
   public void setCLine(int cBorderLine) {
      this.cLine = cBorderLine;
   }

   /**
    * Accessor for raw score borderline for a letter grade of D.
    * @return raw score borderline for a D.
    */
   public int getDLine() {
      return dLine;
   }

   /**
    * Sets the raw score borderline for a letter grade of D.
    * @param dBorderLine raw score to use as borderline for a D.
    */
   public void setDLine(int dBorderLine) {
      this.dLine = dBorderLine;
   }

   /**
    * Accessor for raw score borderline for a letter grade of F.
    * @return raw score borderline for an F.
    */
   public int getFLine() {
      return fLine;
   }

   /**
    * Sets the raw score borderline for a letter grade of F.
    * @param fBorderLine raw score to use as borderline for an F.
    */
   public void setFLine(int fBorderLine) {
      this.fLine = fBorderLine;
   }
}
