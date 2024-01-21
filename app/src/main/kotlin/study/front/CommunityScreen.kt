package study.front

import kotlinx.html.*
import kotlinx.html.dom.document
import kotlinx.html.stream.appendHTML

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

    fun cardBody(communityError :String = "") :String{
        val cardBody = buildString {
            appendHTML().div {
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
            }.appendHTML().div {
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
            }.appendHTML().div {
                classes = setOf("text-danger")
                p {
                    +"${communityError}"
                }
            }.appendHTML().button {
                classes = setOf("btn btn-primary")
                type = ButtonType.submit
                id = "loginBtn"
                +"コミュニティログイン"
            }
        }
        return cardBody
    }
}