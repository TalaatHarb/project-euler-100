use rust_project_euler_100::Runable;
use rust_project_euler_100::solutions::*;
use std::env;
use std::thread;
use std::time::Instant;

fn solve_sequential() {
    p001::P001.run();
    p002::P002.run();
    p003::P003.run();
    p004::P004.run();
    p005::P005.run();
    p006::P006.run();
    p007::P007.run();
    p008::P008.run();
    p009::P009.run();
    p010::P010.run();
    p011::P011.run();
    p012::P012.run();
    p013::P013.run();
    p014::P014.run();
    p015::P015.run();
    p016::P016.run();
    p017::P017.run();
    p018::P018.run();
    p019::P019.run();
    p020::P020.run();
    p021::P021.run();
    p022::P022.run();
    p023::P023.run();
    p024::P024.run();
    p025::P025.run();
}

fn solve_parallel() {
    println!("Running in parallel");

    let jobs = vec![
        thread::spawn(|| p001::P001.run()),
        thread::spawn(|| p002::P002.run()),
        thread::spawn(|| p003::P003.run()),
        thread::spawn(|| p004::P004.run()),
        thread::spawn(|| p005::P005.run()),
        thread::spawn(|| p006::P006.run()),
        thread::spawn(|| p007::P007.run()),
        thread::spawn(|| p008::P008.run()),
        thread::spawn(|| p009::P009.run()),
        thread::spawn(|| p010::P010.run()),
        thread::spawn(|| p011::P011.run()),
        thread::spawn(|| p012::P012.run()),
        thread::spawn(|| p013::P013.run()),
        thread::spawn(|| p014::P014.run()),
        thread::spawn(|| p015::P015.run()),
        thread::spawn(|| p016::P016.run()),
        thread::spawn(|| p017::P017.run()),
        thread::spawn(|| p018::P018.run()),
        thread::spawn(|| p019::P019.run()),
        thread::spawn(|| p020::P020.run()),
        thread::spawn(|| p021::P021.run()),
        thread::spawn(|| p022::P022.run()),
        thread::spawn(|| p023::P023.run()),
        thread::spawn(|| p024::P024.run()),
        thread::spawn(|| p025::P025.run()),
    ];

    for job in jobs {
        let _ = job.join();
    }
}

fn main() {
    let args: Vec<String> = env::args().skip(1).collect();
    let start = Instant::now();

    if !args.is_empty() && args[0] == "-p" {
        solve_parallel();
    } else {
        solve_sequential();
    }

    println!("Total time: {} s", start.elapsed().as_secs_f64());
}
