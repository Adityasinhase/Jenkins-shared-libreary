def call(String email, String subject, String body, String recipient){
  emailext from:"${email}",
                    subject:"${subject}",
                    body:"${body}",
                    to:"${recipient}"
}
