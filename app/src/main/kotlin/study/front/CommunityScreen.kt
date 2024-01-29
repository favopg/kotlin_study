package study.front

import kotlinx.html.*
import kotlinx.html.dom.document
import kotlinx.html.stream.appendHTML
import org.springframework.security.web.csrf.CsrfToken
import study.Sample

/**
 * コミュニティ選択画面
 */
class CommunityScreen {

    fun init (title :String ="コミュニティ選択画面") :String {
        val htmlContent = buildString {
            appendHTML().div {
                classes = setOf("card-header")
                h4 {
                    classes = setOf("mb-0")
                    +"${title}"
                }
            }
        }
        return htmlContent
    }

    fun cardBody(communityError :String = "", csrf : CsrfToken) :String{
        val cardBody = buildString {
            appendHTML().div {
                classes = setOf("card-body")
                form {
                    action = "/community/login"
                    method = FormMethod.post

                    div {
                        classes = setOf("form-group mb-1")
                        label {
                            attributes["for"] = "community"
                            +"コミュニテイ"
                        }

                        input {
                            classes = setOf("form-control")
                            type = InputType.text
                            name = "communityName"
                            id = "communityName"
                            placeholder = "所属しているコミュニティ名を入力してください"
                        }
                        div {
                            classes = setOf("form-group mb-1")
                            label {
                                attributes["for"] = "community"
                                +"合言葉"
                            }
                            input {
                                classes = setOf("form-control")
                                type = InputType.text
                                name = "secret"
                                id = "secret"
                                placeholder = "所属しているコミュニティ名を入力してください"
                            }

                        }
                        div {
                            classes = setOf("text-danger")
                            p {
                                +"${communityError}"
                            }
                        }
                        button {
                            classes = setOf("btn btn-primary")
                            type = ButtonType.submit
                            id = "loginBtn"
                            +"コミュニティログイン"
                        }
                    }
                    input {
                        type = InputType.hidden
                        name = "_csrf"
                        value = "${csrf.token}"
                    }
                }
            }
        }
        return cardBody
    }
}