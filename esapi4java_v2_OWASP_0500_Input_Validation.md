## OWASP-0501 Not applicable ##

The ASVS Level 1A requirement OWASP-0501 is not applicable, it is not a requirement that you'd use ESAPI to build to. Using Java actually is sufficient to meet this particular requirement given the Java language design.

## OWASP-0502 Code sample ##

The ASVS Level 1A requirement OWASP-0502 reads, "Verify that a positive validation pattern is defined and applied to all input."

Here is an example of how to use ESAPI for Java's configuration file to define a positive validation pattern.

` //todo `

Here is an example of how to use ESAPI for Java's Validator to apply the above positive validation pattern.

` //todo `

## OWASP-0503 Code sample ##

The ASVS Level 1A requirement OWASP-0503 reads, "Verify that all input validation failures result in input rejection or input sanitization."

Here is an example of how to determine if a validation failure occurred using ESAPI for Java's Validator. Rejecting the input is up to you!!

` //todo `

Here is an example of how to sanitize HTML using ESAPI for Java's Validator.

` //todo `