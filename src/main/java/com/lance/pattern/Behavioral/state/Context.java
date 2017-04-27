package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class Context {

  public final static OpenState openState = new OpenState();
  public final static CloseState closeState = new CloseState();
  public final static RunState runState = new RunState();
  public final static StopState stopState = new StopState();

  private LiftState liftState;
  private ILift lift;

  public Context(){
    this.setLift(new Lift());
    this.setLiftState(closeState);
  }

  public void setLift(ILift ilift){
    this.lift = ilift;
  }

  public ILift getLift(){
    return this.lift;
  }

  public void setLiftState(LiftState liftState) {
    this.liftState = liftState;
    this.liftState.setContext(this);
  }

  public void open() {
    boolean isStateChanged = this.liftState.open();
    if (isStateChanged){
      this.setLiftState(openState);
    }
  }

  public void close() {
    boolean isStateChanged = this.liftState.close();
    if (isStateChanged){
      this.setLiftState(closeState);
    }
  }

  public void run() {
    boolean isStateChanged = this.liftState.run();
    if (isStateChanged){
      this.setLiftState(runState);
    }
  }

  public void stop() {
    boolean isStateChanged = this.liftState.stop();
    if (isStateChanged){
      this.setLiftState(stopState);
    }
  }
}
