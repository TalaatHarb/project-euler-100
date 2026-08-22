use rust_project_euler_100::Runable;
use rust_project_euler_100::solutions::*;
use std::time::Instant;

fn main() {
    let start = Instant::now();

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

    println!("Total time: {} s", start.elapsed().as_secs_f64());
}
