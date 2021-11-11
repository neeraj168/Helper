private val PASSWORD_PATTERN: String? =
    "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,16}$"

private val pattern = Pattern.compile(PASSWORD_PATTERN)

fun isValidPass(password: String?): Boolean {
    val matcher: Matcher = pattern.matcher(password)
    return matcher.matches()
}
