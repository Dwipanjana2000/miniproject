class User{
    
    constructor(username,email,password){
        this.username=username;
        this.email=email;
        this.password=password;
        this.count++
   
    }
   
    register(){
      console.log(this.username+' is now registered') ;
      //this.count++;
     
    }
registeredUser(){
      console.log(this.count)
}

}
class Member extends User {
    constructor(username, email, password, memberpackage) {
      super(username, email, password);
      this.package = memberpackage;
      let todaysDate = new Date();
      const membershipactivetillYear = todaysDate.getFullYear();
      const membershipactivetillMonth = todaysDate.getMonth();
      const membershipactivetillDay = todaysDate.getDay();
      this.membershipactivetilldate = new Date(
        membershipactivetillYear,
        membershipactivetillMonth,
        membershipactivetillDay
      );
    }
  
    renewMembership() {
      const membershipactivetillYear = this.membershipactivetilldate.getFullYear();
      const membershipactivetillMonth = this.membershipactivetilldate.getMonth();
      const membershipactivetillDay = this.membershipactivetilldate.getDay();
  
      this.membershipactivetilldate = new Date(
        membershipactivetillYear,
        membershipactivetillMonth + 1, //just increase the month by 1
        membershipactivetillDay
      );
    }
  
    subscriptionActiveTill() {
      console.log(
        this.username +
          " is scubscribed to " +
          this.package +
          "uptill" +
          this.membershipactivetilldate
      );
    }
  
    getPackage() {
      console.log(this.username + " is scubscribed to " + this.package);
    }
  }
  
  const mike = new Member("mike", "abc@gmail.com", "pass123", "Standard Packege");
  
  mike.getPackage();
  
  mike.renewMembership();
  mike.subscriptionActiveTill();
  