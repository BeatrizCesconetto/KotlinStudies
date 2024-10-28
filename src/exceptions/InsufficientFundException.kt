package exceptions

class InsufficientFundException(currentBalance : Double) : RuntimeException("Current balance is $currentBalance" )