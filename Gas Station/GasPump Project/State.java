/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public enum State{
      isUnInitialized, //Till credit card is swiped
      isUnValidated,
      isValidatedButUnfueled,
      isFuelSelectedButUnfueled,
      isPrintApproval,
      isCarWashSelected,
      isFilled,
      isPrintReceipt,
      isOver,
     isTimeOut;  
    
    
    }
