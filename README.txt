University of Portland
CS376 - lab 13 source file starter code
This lab is on practice of Git and CICD tools

Author: Martin Cenek, 2022, 2024
Version: 1.0 2022
Version: 2.0 2024

to compile:
javac WindowExample.java

to run:
java WindowExample
# java-desktop-lite

1. Create a codespace on main
   - Click on the green "Code" button and select "Open with Codespaces"
   - This will open a new codespace with a devcontainer with desktop-lite installed
2. In the Web-based VSCode, open a new bash terminal and run the following command to start the application

```bash
cd lab13/code/swing
javac WindowExample.java
java WindowExample
```

3. Go to the Ports tab in the bottom panel and open the forwarded address for port 6080 in the browser.
   - Cmd/Ctrl + Shift + P -> View: Toggle Ports
   - Open the link next to "Forwarded Port: 6080"
4. Click "Connect" to connect to the VNC server.

## Troubleshooting

If a window does not appear containg the text "You are a CS376 rockstar!, try the following:

- If you are already running `java WindowExample` in the terminal, try stopping the process and running it again.
- If you are not running `java WindowExample` in the terminal, try running it.
