# PokemonTCG
PokemonTCG is an android application that shows the list of pokemon trading card game. In this application, user also can see the detail of the trading card by clicking each card in the list. If the users love the card, they can also download the card and see it in their gallery. Do you have a problem with your internet connection? Please don't worry because this application also support offline capabilities. So when user lost their internet connection, as long as they do not refresh the page, their last loaded pokemon still can be showed in the page. 

# About the Android Project
This application is implementing MVVM architecture pattern where the view (activity/fragment) observe live data from the view model. 
While the data that observed in view model is obtained from data source layer (model and repository). 
Then in this project, data layer is the only layer that connecting response API and processed by RemoteMediator and then send it to presentation layer (view and view model) so it can be viewed by the users.
By using RemoteMediator, We can ensure that the only source of the data is from local database (Room DB). Because after the data from the response API fetched, We store the data to the local database. So the data that sent to the presentation layer is only data that is in the local database. Thus this project has implemented single source of truth (SSoT).

# Tech Stack
- Kotlin Programming Language
- Koin Dependency Injection
- Paging 3
- Retrofit2
- Glide

# RestAPI
- <a href="https://docs.pokemontcg.io/">PokemonTCG RestAPI</a>

# Project Installation
1. Clone the repository

   ```sh
   git clone https://github.com/iqbalShafiq/PokemonTCG
   cd PokemonTCG
   ```
   
2. Waiting for building gradle project
3. Run the app from emulator or physical device 

# Screenshots

## Splash Screen
<img src="https://i.ibb.co/0mLSXtM/image.png" alt="Splash Screen" style="width:200px;"/>

## List Activity and The States
![List Activity and The States](https://i.ibb.co/GWdyvMr/image.png)

## Detail Activity and Downloading Process
<img src="https://i.ibb.co/7JVDjtW/image.png" alt="Detail Activity and Downloading Process" style="width:450px;"/>

## Card Collection in Gallery (*My own phone gallery, not included in app)
<img src="https://i.ibb.co/DDyzzhf/image.png" alt="Card Collection in Gallery" style="width:200px;"/>

# My Suggestions and Conclusions
This application still needs some improvement features like adding favorite pokemon card, switching the theme, create in-app card collection gallery page, and give each card different background color in the detail page based on their majority color so it can gives a better UI. As a developer, I need to explore more deeply about the usage of Paging 3 library. Because I think I must be utilize paging 3 more efficiently. But, at least for this current version I hope the app can be reference for other application that have similar functionality and I also hope this version doesn't have any crash. Last but not least, Happy Trading :D
