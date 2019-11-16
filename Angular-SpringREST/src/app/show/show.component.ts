import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {
  username:string;
  result: any;
  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

    searchUser():void{
     this.http.get("http://localhost:9098/employees/"+this.username).subscribe((result)=>{
       this.result= result;

     //console.log("it works!"+result);
     });
    }
}
