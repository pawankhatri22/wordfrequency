# wordfrequency
Project to find word frequency and similar words in Labforward's notebook.

I have taken around 2 to 3 hours to make rest api and then moved to html and took around 2 hours to make basic ui and then integrated the rest api. 
I can improve more in the api and ui in future sprints like adding logs in api, optimizing the search logic, add caching etc if possible.
I will also add database through which we can add and fetch notebook's notes. for now I have used a simple string.

![image](https://user-images.githubusercontent.com/32278634/198060167-fd033141-6b0a-44b6-90e0-5bee571c6421.png)



Project contains 1 API and a basic HTML UI 
   1) findWordFrequency: User will provide a word as request param and api will return frequency of word and list of similar words. 
   
   ![image](https://user-images.githubusercontent.com/32278634/198059278-6a079db5-a048-4ede-ba9d-38b09fdeff32.png)
   
   
   2) UI : user can enter a word to be searched and UI will call above api to find word frequency and list of smiliar words
   
   ![image](https://user-images.githubusercontent.com/32278634/198061081-5db40a5f-45e5-4e71-81e3-fddadcf8e33a.png)
