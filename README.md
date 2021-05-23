# Time in words

This project just convert a number than represent a time on description of the hour.
For example, the application receive this number on first parameter 5 and this 0 on second. The response going to be like this "five o' clock".
* This application accept am/pm hour format.

### Dependencies

##### Update packages before

Before install this project, you need to install the maven, follow the steps below this.

```
sudo apt update
```
```
sudo apt upgrade
```
Done? Right, now you can install maven using the command below.

```
sudo apt install maven
```
Wait to finish, you can confirm the version installed.
```
mvn -version
```

### Installing

Clone the repository ***git@github.com:cleidir/timeinwords.git***

Access the project directory and execute te commands below to install the application.

```
cd timeinwords/
```

```
mvn clean install
```
Wait for the end of process, and than run this to execute the app using command below.

```
java -jar -Dapple.awt.UIElement="true" target/time.words-0.0.1-SNAPSHOT.jar -h
```