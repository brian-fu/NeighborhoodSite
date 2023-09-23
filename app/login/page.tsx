import "./login.css"

export default function Login() {
  return (
    <div id="login-tab">
        <form>
            <input minLength={3} name="username" id="username" type="text" placeholder="username" required></input><br/>
            <input minLength={5} name="password" id="password" type="password" placeholder='password' required></input><br/>
            <input type="submit" value="Login"/>
        </form>
    </div>
  )
}
