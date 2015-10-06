package json.schema.codegen

trait TypeScriptNaming extends Naming {

  override val reservedKeywords: Set[String] = Set(
    "break", "case", "catch", "class", "const",
    "continue", "debugger", "default", "delete",
    "do", "else", "enum", "export", "extends", "false",
    "finally", "for", "function", "if", "import", "in",
    "instanceof", "new", "null", "return", "super", "switch",
    "this", "throw", "true", "try", "typeof", "var", "void",
    "while", "with", "as", "implements", "interface", "let",
    "package", "private", "protected", "public", "static", "yield"
  )

}
