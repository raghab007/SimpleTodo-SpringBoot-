<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portfolio for Aastha</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            text-align: center;
            padding: 20px;
            border: 2px solid #4682b4;
            border-radius: 10px;
            background-color: #ffffff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #4682b4;
        }

        .profile-picture {
            width: 150px;
            height: 150px;
            border-radius: 50%;
            background-image: url('https://via.placeholder.com/150');
            background-size: cover;
            background-position: center;
            margin: 20px auto;
            transition: transform 0.3s ease;
        }

        .profile-picture:hover {
            transform: scale(1.1);
        }

        .description {
            margin: 20px 0;
        }

        button {
            padding: 10px 20px;
            font-size: 16px;
            color: #ffffff;
            background-color: #4682b4;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #5a9bd4;
        }

        #message {
            margin-top: 20px;
            opacity: 0;
            transition: opacity 0.3s ease;
        }

        #message.visible {
            opacity: 1;
        }

        .flower {
            width: 100px;
            margin-top: 20px;
            display: block;
            transition: transform 0.3s ease;
        }

        .flower:hover {
            transform: scale(1.2);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Aastha's Portfolio</h1>
        <p>Hover over the elements to see the effects!</p>
        <div class="content">
            <div class="profile-picture"></div>
            <div class="description">
                <p>Aastha is a wonderful person with amazing talents. This portfolio is a testament to her skills and achievements.</p>
                <button id="loveButton">Click to see a message</button>
                <div id="message" class="hidden">
                    <p>I love you the most, Jaan!</p>
                    <p>I love you forever</p>
                    <img src="https://via.placeholder.com/100" alt="Flower" class="flower">
                </div>
            </div>
        </div>
    </div>

    <script>
        document.getElementById('loveButton').addEventListener('click', function() {
            const message = document.getElementById('message');
            message.classList.toggle('visible');
        });
    </script>
</body>
</html>
