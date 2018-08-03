package com.inss.atmn;

public class TransactionControls {

  private boolean mtiPresent;
  private boolean panValid;
  private boolean transactionOn;

  public TransactionControls(boolean mtiPresent, boolean panValid, boolean transactionOn) {

    this.mtiPresent = mtiPresent;
    this.panValid = panValid;
    this.transactionOn = transactionOn;
  }

  public boolean isMtiPresent() {
    return mtiPresent;
  }

  public boolean isPanValid() {
    return panValid;
  }

  public boolean isTransactionOn() {
    return transactionOn;
  }

  public void setMtiPresent(boolean mtiPresent) {
    this.mtiPresent = mtiPresent;
  }

  public void setPanValid(boolean panValid) {
    this.panValid = panValid;
  }

  public void setTransactionOn(boolean transactionOn) {
    this.transactionOn = transactionOn;
  }
}
