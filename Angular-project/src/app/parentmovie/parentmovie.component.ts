import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentmovie',
  templateUrl: './parentmovie.component.html',
  styleUrls: ['./parentmovie.component.css']
})
export class ParentmovieComponent implements OnInit {
  selectedMovie;
  movies = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      name : 'Adventure',
      Rating : 7 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      name : 'Spider Man',
      Rating: 10 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      name : 'Charlie Chaplin',
      Rating :  8,
      // tslint:disable-next-line: max-line-length
      Description : 'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      name : 'Avengers',
      Rating : 8 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with',
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendMovie(movie) {
    console.log(movie);
    this.selectedMovie = movie;
  }

}
